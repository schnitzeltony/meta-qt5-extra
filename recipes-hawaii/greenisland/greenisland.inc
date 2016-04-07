SUMMARY = "Support library to make Qt-based Wayland compositors development easier"
LICENSE = "LGPLv3 | GPLv2 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.LGPLv2.1;md5=4fbd65380cdd255951079008b364516c \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii pythonnative pkgconfig

SRC_URI = " \
    git://github.com/greenisland/${BPN}.git;protocol=git;branch=master \
"

SRCREV = "c39760ad84b8d7d872b23d97a6f7aa5be236dacd"
PV = "0.7.90+git${SRCPV}"

S = "${WORKDIR}/git"
