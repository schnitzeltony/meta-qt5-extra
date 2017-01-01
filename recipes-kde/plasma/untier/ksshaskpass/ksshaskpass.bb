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
SRC_URI[md5sum] = "bdafdc215db3e3d011465447576876cf"
SRC_URI[sha256sum] = "b0abeaba2a3eff16e233e047b41c20bf4065b4529e706929f4c0e6a9884324bf"
