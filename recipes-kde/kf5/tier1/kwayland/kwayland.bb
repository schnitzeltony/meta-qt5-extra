SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "wayland wayland-native wayland-protocols"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5141cdc1fcd46d43ac0043c10112be2b"
SRC_URI[sha256sum] = "91314f19f5c99cd7763656c95362f81635142732feff02f05c554da3f094e168"
