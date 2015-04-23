FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

#SRCREV = "e6805407b62c9c57bac488813f77ee5cca71868e"
#SRC_URI = " 
#    git://qt.gitorious.org/qt/qtwayland.git;branch=dev
#    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch 
#    file://0001-Move-surfaces-to-outputs.patch
#    file://0002-Remove-output-extension.patch
#    file://0003-Update-wayland.xml-to-1.6.patch

SRCREV = "8ad3ed1efad86d1f5cd8aaca01f3ff46de485de8"

SRC_URI = " \
    git://github.com/maui-packages/qtwayland.git;branch=output54 \
    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch \
    \
"

S = "${WORKDIR}/git"

QT_VERSION = "5.6.0"

LICENSE = "GFDL-1.3 & BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = "file://LICENSE.LGPLv21;md5=58a180e1cf84c756c29f782b3a485c29 \
                    file://LICENSE.LGPLv3;md5=c4fe8c6de4eef597feec6e90ed62e962 \
                    file://LGPL_EXCEPTION.txt;md5=9625233da42f9e0ce9d63651a9d97654 \
                    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e"
