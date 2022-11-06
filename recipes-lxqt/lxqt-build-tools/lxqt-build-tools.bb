SUMMARY = "Various packaging tools and scripts for LXQt applications"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause;md5=a8987c1fd6930fe14ae46b4d72e53770"

# lxqt.bbclass adds an inherit on this recipe
inherit cmake_qt5_extra

do_configure:append() {
    sed -i 's:set(LXQT_ETC_XDG_DIR.*:set(LXQT_ETC_XDG_DIR        "${sysconfdir}/xdg"):' ${B}/install/LXQtConfigVars.cmake
}

SRC_URI = "git://github.com/lxde/${BPN}.git;branch=master;protocol=https"
SRCREV = "bc7e872ed3a544efaa68f7820926975bf8d469d6"
PV = "0.12.0"
S = "${WORKDIR}/git"
