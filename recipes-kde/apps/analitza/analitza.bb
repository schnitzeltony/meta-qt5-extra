SUMMARY = "Add mathematical features to your program"
LICENSE = "GPL-2.0 & LGPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=28d73eafa40ebd0ccdc6b37df8de10a3 \
"

inherit kde-apps

DEPENDS += " \
    libeigen \
    qtsvg \
    qtdeclarative \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "dda39c7ffbb8c47e8b6ff4682948e68be2ea382c16f3f4bb4c1484631eb3a4cb"

FILES_${PN} += " \
    ${datadir}/libanalitza \
    ${OE_QMAKE_PATH_QML} \
"
