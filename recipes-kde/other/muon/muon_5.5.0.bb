SUMMARY = "A collection of package management tools for Debian-based systems"
LICENSE = "GPLv3 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
    file://COPYING.GFDL;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-base gtk-icon-cache

DEPENDS += " \
    libqapt \
    libdebconf-kde \
    \
    kio \
    kdelibs4support \
    kdbusaddons \
"

SRC_URI[md5sum] = "004e91140a482d16cdd749aafcede0ba"
SRC_URI[sha256sum] = "4f6164687077fc1042ab9e873c71afab9ed7689d9963e0f3d34fa19291d2c6da"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kxmlgui5 \
"
