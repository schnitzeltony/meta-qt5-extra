SUMMARY = "Image editing components"
LICENSE = "BSD-2-Clause & CC0-1.0 & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

DEPENDS = "qtdeclarative"

inherit kde-base gettext

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BP}.tar.xz"
SRC_URI[sha256sum] = "3cfba775498e031f6963669ee0e4426d4fddd48a244b9583620de4d312ba92ca"
PV = "0.2.0"

FILES:${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"
