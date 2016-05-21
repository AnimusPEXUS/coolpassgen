
cmake_minimum_required (VERSION 2.6)

project(coolpassgen)

find_package(Java)
include(UseJava)

file(
    GLOB jar_files
    LIST_DIRECTORIES false
    org/wayround/coolpassgen/*.java
    )

#echo(jar_files)

add_jar(coolpassgen
    SOURCES ${jar_files} COPYING applet.policy CMakeLists.txt ${jar_files}
    ENTRY_POINT org.wayround.coolpassgen.MainWindow
    VERSION 1.5
    )
