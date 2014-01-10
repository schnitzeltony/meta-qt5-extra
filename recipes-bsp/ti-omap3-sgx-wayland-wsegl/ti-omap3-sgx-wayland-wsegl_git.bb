DESCRIPTION = "WSEGL plugin for SGX drivers"
LICENSE = "LGPLv2+ & proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86515e83f3ce1048848e1122b9b1ef9c \
                    file://LICENSE.LGPL;md5=24a4036de5c39ff01ad4986c4870d8c0"

SRC_URI = "git://github.com/nemomobile/ti-omap3-sgx-wayland-wsegl.git;protocol=git;branch=master"
SRCREV = "5c56c8f809f1e08e5b774e3b728efd3d0a756dd3"

S = "${WORKDIR}/git"

inherit qmake5

DEPENDS = "qtbase wayland libgles-omap3"

DEFAULT_PREFERENCE_omap3 = "99"
DEFAULT_PREFERENCE = "-1"
