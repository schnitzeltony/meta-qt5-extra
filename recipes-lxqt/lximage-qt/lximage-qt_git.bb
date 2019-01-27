SUMMARY = "The image viewer and screenshot tool for LXQt"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

REQUIRED_DISTRO_FEATURES = "x11"

inherit lxqt pkgconfig distro_features_check gtk-icon-cache mime

DEPENDS += "qtx11extras qtsvg libfm-qt libexif libxfixes"

SRCREV = "4fd1d2799e9d58e4ee3dd9dc2025acbf27bfda98"
PV = "0.14.0"

FILES_${PN} += "${datadir}/icons"
