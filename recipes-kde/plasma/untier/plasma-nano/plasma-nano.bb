SUMMARY = "Widget theme for GTK 2 and 3"
LICENSE = "BSD-3-Clause & LGPL-2.1-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=9e2385fe012386d34dcc5c9863070881 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=da48810c4ddf8e49efa031294a26b98c \
"

inherit kde-plasma gettext

DEPENDS += " \
    kpackage-native \
    plasma-framework \
    kwindowsystem \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "95299f2acc9c9205d93951263d5b499487ee10d00d097393f167d234ac01163f"

FILES:${PN} += " \
    ${datadir}/plasma \
    ${datadir}/kservices5 \
    ${datadir}/plasma/shells \
    ${datadir}/plasma/packages \
    ${OE_QMAKE_PATH_QML} \
"
