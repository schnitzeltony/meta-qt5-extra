SUMMARY = "Various packaging tools and scripts for LXQt applications"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause;md5=a8987c1fd6930fe14ae46b4d72e53770"

# lxqt.bbclass adds an inherit on this recipe
inherit cmake_qt5_extra

do_configure:append() {
    sed -i 's:set(LXQT_ETC_XDG_DIR.*:set(LXQT_ETC_XDG_DIR        "${sysconfdir}/xdg"):' ${B}/install/LXQtConfigVars.cmake
}

SRC_URI = " \
    git://github.com/lxde/${BPN}.git;branch=master;protocol=https \
    file://0001-Fix-GLib-2.71.1.patch \
"
SRCREV = "a11ff29e32225194c0a0ccb554e39eb7c5322cde"
PV = "0.10.0"
S = "${WORKDIR}/git"
