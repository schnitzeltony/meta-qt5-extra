SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kwallet \
    kwidgetsaddons \
    kdoctools-native \
"

# REVISIT optionals
DEPENDS += " \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "c1b0479dc4ae0a183c41e4e546801df5332387026b101b735a8024dd8109447e"
