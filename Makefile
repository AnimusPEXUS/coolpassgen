BUILD_CP = -cp .
SRC_SUBPATH = ./org/wayround/coolpassgen

BUILD_FLAGS = -Xlint

VERSION=1.3

DESTINATION_JAR=./dist/CoolPassGen-$(VERSION).jar

all: $(SOURCE_TARGETS)
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainContent.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/About.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainWindow.java

	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/AppletRunnable.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainApplet.java

clean:
	-rm $(SRC_SUBPATH)/*.class

jar: clean all
	-mkdir dist
	-rm $(DESTINATION_JAR)
	jar -cfe $(DESTINATION_JAR) \
		org.wayround.coolpassgen.MainWindow \
		org/ \
		Makefile \
		COPYING
		applet.policy 

run: all
	java $(BUILD_CP) org.wayround.coolpassgen.MainWindow

