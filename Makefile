BUILD_CP = -cp .
SRC_SUBPATH = ./org/wayround/coolpassgen

BUILD_FLAGS = -Xlint

VERSION=1.3

all: $(SOURCE_TARGETS)
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainContent.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/About.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainWindow.java

	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/AppletRunnable.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainApplet.java

jar: all
	-mkdir dist
	jar -cfe ./dist/coolpassgen-$(VERSION).jar \
		org.wayround.coolpassgen.MainWindow \
		org/ \
		Makefile \
		COPYING
		# applet.policy 

run: all
	java $(BUILD_CP) org.wayround.coolpassgen.MainWindow

