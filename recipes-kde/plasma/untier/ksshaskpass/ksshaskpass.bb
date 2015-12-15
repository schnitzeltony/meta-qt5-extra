SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kwallet \
    kwidgetsaddons \
"

# REVISIT optionals
DEPENDS += " \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "804106b366f726c67b592b4603c7dbe2"
SRC_URI[sha256sum] = "1bd5b7b9e4ef58c4f1586af1818fea25cd772eba6f5d2285bcfea8cb4d814e75"
