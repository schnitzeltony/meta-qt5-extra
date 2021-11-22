require ${BPN}.inc 

SRC_URI += "file://0003-Do-not-hardcode-python-path-it-points-to-sysroot.patch"

DEPENDS += "${BPN}-native gettext-native qtscript qtdeclarative"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5 \
    ${OE_QMAKE_PATH_QML} \
"

RDEPENDS:${PN}-dev += "python3"
