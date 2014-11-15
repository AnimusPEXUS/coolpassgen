BUILD_CP = -cp .
SRC_SUBPATH = ./org/wayround/coolpassgen

BUILD_FLAGS = -Xlint


all: $(SOURCE_TARGETS)
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/MainWindow.java
	javac $(BUILD_CP) $(BUILD_FLAGS) $(SRC_SUBPATH)/About.java

run: all
	java $(BUILD_CP) org.wayround.coolpassgen.MainWindow

