SUMMARY = "Add mathematical features to your program"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += " \
    libeigen \
    qtsvg \
    qtdeclarative \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "f8186958405a7ee235ba0bff76c0f126"
SRC_URI[sha256sum] = "c241b6a3d849534ccd50601c0aebd5cd785220bb7957ed7f6b1d3db35ba0f925"

FILES_${PN} += " \
    ${datadir}/libanalitza \
    ${OE_QMAKE_PATH_QML} \
"
