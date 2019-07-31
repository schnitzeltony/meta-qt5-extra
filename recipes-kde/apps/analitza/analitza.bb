SUMMARY = "Add mathematical features to your program"
LICENSE = "GPLv2 & LGPLv2 & GFDL-1.2"
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
SRC_URI[md5sum] = "9cb9bfe7ef6862f97edc20a42efa2d4a"
SRC_URI[sha256sum] = "771cf26918ea09f1597ee95328bdfc1c65b28617b0b312ca609676a718fc2a9e"

FILES_${PN} += " \
    ${datadir}/libanalitza \
    ${OE_QMAKE_PATH_QML} \
"
