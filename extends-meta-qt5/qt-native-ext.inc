DEPENDS = "qtbase-native"

QT_MODULE = "${BPN}"

require recipes-qt/qt5/qt5-native.inc

do_configure() {
    ${OE_QMAKE_QMAKE} ${OE_QMAKE_DEBUG_OUTPUT} -r ${S}
}

do_install() {
    oe_runmake install INSTALL_ROOT=${D}
}
