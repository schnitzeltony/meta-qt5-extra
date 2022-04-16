SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPL-2.0-or-later & LGPL-2.1-only & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5bb9918b92ac37f1bc52c5abe04e8dbea54f31fa0101edad6d9e92c3a9f0485b"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
