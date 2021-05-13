SUMMARY = "KHOTKEYS"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-2.0-only & GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += "\
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    sonnet-native \
    kpackage-native \
    kdelibs4support-native \
    kdesignerplugin-native \
    kglobalaccel \
    ki18n \
    kio \
    kxmlgui \
    kdelibs4support \
    kdbusaddons \
    kcmutils \
    plasma-framework \
    plasma-workspace \
    \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11 qtx11extras", "", d)} \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "2d58299f705f928f877718c1766a6dce201d728a24e88b9a24ca5e12a5f99c13"

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${datadir}/dbus-1 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
