SUMMARY = "Text completion helpers and widgets"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

DEPENDS += "kconfig kconfig-native kwidgetsaddons"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "08f1525c6cee8babe399c941bb85d04be9dade0341d1d85c6beccd2e93dc7ceb"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
