SUMMARY = "KDE games meta"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# libkmahjongg packages get dynamically renamed
PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    bovo \
    granatier \
    kapman \
    katomic \
    kblocks \
    kbounce \
    kbreakout \
    kdiamond \
    kgoldrunner \
    kmahjongg \
    kmines \
    kpat \
    kreversi \
    ksudoku \
    libkdegames \
    libkmahjongg \
"
