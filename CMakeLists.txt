cmake_minimum_required(VERSION 2.8.10)
find_package(Java)
include(UseJava)

FILE(GLOB source
    "${CMAKE_CURRENT_SOURCE_DIR}/src/org/wayround/coolpassgen/*.java"
)

add_jar(coolpassgen ${source})
