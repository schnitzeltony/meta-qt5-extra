project(kwinnative LANGUAGES CXX)

set(CMAKE_AUTOMOC ON)

find_package(Qt5 COMPONENTS Core REQUIRED)

add_executable(kwin-strip-effect-metadata strip-effect-metadata.cpp)
target_link_libraries(kwin-strip-effect-metadata Qt5::Core)
