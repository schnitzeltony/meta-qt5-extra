SUMMARY = "LXQt system settings center"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "7d7260744543710e89e7f09d53757a18b6825ac4"
PV = "0.5.0"

FILES_${PN} += "${datadir}/icons"
