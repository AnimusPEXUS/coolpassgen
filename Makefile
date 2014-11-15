
BUILD_CP = -cp ./src
BUILD_FLAGS = -Xlint


all: $(SOURCE_TARGETS)
	javac $(BUILD_CP) $(BUILD_FLAGS) src/coolpassgen/MainWindow.java
	javac $(BUILD_CP) $(BUILD_FLAGS) src/coolpassgen/About.java

run: all
	java $(BUILD_CP) coolpassgen.MainWindow
