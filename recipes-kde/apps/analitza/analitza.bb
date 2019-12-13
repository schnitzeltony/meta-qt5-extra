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
SRC_URI[md5sum] = "ae7880c7c9aa570e97dba3a8e9e73932"
SRC_URI[sha256sum] = "b227607549e331d2c291ae078e0568fbc7ae4750ec5450a3b50160aa116f7cb2"

FILES_${PN} += " \
    ${datadir}/libanalitza \
    ${OE_QMAKE_PATH_QML} \
"
