require ${BPN}.inc

DEPENDS += " \
    ${BPN}-native \
    qtbase \
"

SRC_URI += "file://0002-Do-not-export-kdwsdl2cpp-as-target-it-will-fin-it-s-.patch"

FILES:${PN}-dev += "${datadir}/mkspecs"
