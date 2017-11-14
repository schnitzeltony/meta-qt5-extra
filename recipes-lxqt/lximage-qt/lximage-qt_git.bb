SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "84dc86611f3e3356dd6fbef6c72b29948278015a"
PV = "0.6.0"

FILES_${PN} += "${datadir}/icons"
