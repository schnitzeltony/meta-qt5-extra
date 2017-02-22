SUMMARY = "Widgets for tracking KJob instances"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "kcoreaddons kwidgetsaddons ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cc2f41fd5b8ba6ad795a7835a68d4e8c"
SRC_URI[sha256sum] = "ca31f5324ba4ad421006ed9993f3d5bc55557e0c5a987f1f419ae1ca18b5f999"

FILES_${PN} += "${datadir}/dbus-1"
