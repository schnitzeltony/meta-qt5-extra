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
"

inherit cmake_lib

SRC_URI += " \
    file://0001-Avoid-RPATH-if-not-configured.patch \
    file://0002-AvogadroLibsConfig.cmake-Find-include.patch \
"

EXTRA_OECMAKE += "-DENABLE_RPATH=OFF"

# avogadrolibs has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     sed -i 's:-isystem :-I :g' `find ${B} -name '*.ninja'`
}

FILES_${PN} += " \
    ${libdir}/avogadro2/scripts \
"

FILES_${PN}-staticdev += " \
    ${libdir}/avogadro2/staticplugins \
"

CMAKE_ALIGN_SYSROOT[1] = "avogadrolibs, -S${prefix}, -S${STAGING_DIR_HOST}/${prefix}"
