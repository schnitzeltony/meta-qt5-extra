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
SRC_URI[sha256sum] = "11c839454b1393ca48cc7af8872f4bbf9cae8e7c971816985bba8f701b739abc"

FILES_${PN} += " \
    ${datadir}/libanalitza \
    ${OE_QMAKE_PATH_QML} \
"
