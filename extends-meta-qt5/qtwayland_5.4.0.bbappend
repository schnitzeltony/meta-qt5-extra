FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

#SRCREV = "e6805407b62c9c57bac488813f77ee5cca71868e"
#SRC_URI = " 
#    git://qt.gitorious.org/qt/qtwayland.git;branch=dev
#    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch 
#    file://0001-Move-surfaces-to-outputs.patch
#    file://0002-Remove-output-extension.patch
#    file://0003-Update-wayland.xml-to-1.6.patch

SRCREV = "08b71734b6af5aaa49fa12e8a8d59144da223565"

SRC_URI = " \
    git://github.com/maui-packages/qtwayland.git;branch=output54 \
    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch \
    \
"

S = "${WORKDIR}/git"

QT_VERSION = "5.5.0"
