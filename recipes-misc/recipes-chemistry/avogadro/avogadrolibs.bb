require ${BPN}.inc

DEPENDS = " \
    ${BPN}-native \
    glew \
    openbabel \
    libeigen \
    molequeue \
    spglib \
    libmsym \
    libarchive \
    msgpack-c \
    mmtf-cpp \
"

inherit cmake_extra_sanity features_check

REQUIRED_DISTRO_FEATURES = "opengl"

SRC_URI += " \
    file://0001-Avoid-RPATH-if-not-configured.patch \
    file://0002-AvogadroLibsConfig.cmake-Find-include.patch \
"

do_configure_append() {
    # fix python executable path to not point to sysroot
    sed -i 's:pythonInterpreterPath =.*:pythonInterpreterPath = "${bindir}/python3";:g' ${B}/avogadro/qtgui/avogadropython.h
    # fix absolute sysroot library paths
    sed -i \
        -e 's:${STAGING_LIBDIR}/libGLEW.so:GLEW:g' \
        -e 's:${STAGING_LIBDIR}/libGL.so:GL:g' \
        -e 's:${STAGING_LIBDIR}/libGLU.so:GLU:g' \
        -e 's:${STAGING_LIBDIR}/libarchive.so:archive:g' \
        ${B}/CMakeFiles/Export/lib/cmake/avogadrolibs/AvogadroLibsTargets.cmake
}

EXTRA_OECMAKE += "-DENABLE_RPATH=OFF"

FILES_${PN} += " \
    ${libdir}/avogadro2/scripts \
"

FILES_${PN}-staticdev += " \
    ${libdir}/avogadro2/staticplugins \
    ${libdir}/avogadro2/*.a \
"
