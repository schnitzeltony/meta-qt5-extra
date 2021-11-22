SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPL-2.0+ & LGPL-2.1 & LGPL-2.1+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "60f4e112f6862f7e0536e625ce53ec67c77c873d9802ef92f485b5d752b383fe"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
