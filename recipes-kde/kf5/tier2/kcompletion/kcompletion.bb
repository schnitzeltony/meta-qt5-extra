SUMMARY = "Text completion helpers and widgets"
LICENSE = "BSD-3-Clause & LGPL-2.0+ & LGPL-2.1+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "dec689554239e05186fe1114467732b939849a649f9526112954a8f599ba86a6"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
