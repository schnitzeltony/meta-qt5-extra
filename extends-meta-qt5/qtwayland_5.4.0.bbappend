FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# as long as 5.4.1 is not out we need to hack Pier Luigi Fiorini's patches in
SRCREV = "07f199be4f07913469dd0b8fe68ed79bfa25c266"

SRC_URI = " \
    git://github.com/maui-packages/qtwayland.git;protocol=git;branch=output54 \
    file://0001-examples-wayland-include-server-buffer-only-when-bui.patch \
"

S = "${WORKDIR}/git"

QT_VERSION = "5.5.0"
