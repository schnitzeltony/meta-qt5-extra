require ${BPN}.inc 

inherit pythonnative

SRC_URI += "file://0003-Do-not-hardcode-python-path-it-points-to-sysroot.patch"

DEPENDS += "${BPN}-native gettext-native qtscript qtdeclarative"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"

RDEPENDS_${PN}-dev += "python3"
