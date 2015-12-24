SUMMARY = "KDE games meta"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    bovo \
    kapman \
    katomic \
    kbounce \
    kdiamond \
    libkdegames \
"
