SUMMARY = "Library to assist determining when holidays occur"
LICENSE = "Bison-exception-2.2 & BSD-2-Clause & GPL-3.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/Bison-exception-2.2.txt;md5=fe1adebe74bce848e36673c70d09e755 \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "5f9c0f0b652c9169b39148120d57c26d0c73c82111e8844d51e5c39fc3d7d5ce"

PV = "${KF5_VERSION}"

DEPENDS += " \
    qtdeclarative \
"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde/${BPN}"
