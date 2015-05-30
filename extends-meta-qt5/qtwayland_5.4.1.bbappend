FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRCREV = "1d0475db32e114d9f15345293a143a21dfa41d34"

SRC_URI = " \
    git://github.com/maui-packages/qtwayland.git;branch=output54 \
    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch \
"

S = "${WORKDIR}/git"

QT_VERSION = "5.4.2"

LICENSE = "GFDL-1.3 & BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
