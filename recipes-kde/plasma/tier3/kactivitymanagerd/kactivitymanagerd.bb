SUMMARY = "System service to manage user's activities"
LICENSE = "GPL-2.0 | GPL-3.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma gettext

DEPENDS += " \
    boost \
    kdbusaddons \
    ki18n \
    kauth-native \
    kcoreaddons \
    kcoreaddons-native \
    kconfig \
    kconfig-native \
    kxmlgui \
    kwindowsystem \
    kio \
    kservice \
    kglobalaccel \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "eec1a0996812d89b98e93a3a2dec15527fd553c2c9c608ad7f1858f01749c3b0"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
	${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"
