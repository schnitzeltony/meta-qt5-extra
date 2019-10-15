SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPLv2"
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
SRC_URI[md5sum] = "434f0ba5e9a053f20a698048b1b8fa06"
SRC_URI[sha256sum] = "75ed318ebac038b6309b78f10dd1ef6e23935e93f7575372e2c2c4bbe607febb"
