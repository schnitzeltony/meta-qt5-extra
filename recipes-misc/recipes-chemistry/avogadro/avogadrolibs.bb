require ${BPN}.inc

DEPENDS = " \
   ${BPN}-native \
   glew \
   openbabel \
   libeigen \
   molequeue \
   spglib \
"

inherit cmake_lib

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${libdir}/libAvogadro*.so \
    ${libdir}/avogadro2/scripts \
"

FILES_${PN}-staticdev += " \
    ${libdir}/avogadro2/staticplugins \
"
FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

CMAKE_ALIGN_SYSROOT[1] = "avogadrolibs, -S${prefix}, -S${STAGING_DIR_HOST}/${prefix}"

