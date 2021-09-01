SUMMARY = "System service to manage user's activities"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LGPL-2.1-only & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
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
SRC_URI[sha256sum] = "22ab64377d595e0384285d95fe21464ab63a7644d2303cc0002b495f85412a19"

FILES_SOLIBSDEV = ""

FILES:${PN} += " \
	${datadir}/k*5 \
    ${datadir}/krunner \
    ${datadir}/dbus-1 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${systemd_user_unitdir} \
"
