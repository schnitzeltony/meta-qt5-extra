SUMMARY = "User configurable main windows"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    kitemviews \
    kconfig \
    kglobalaccel \
    kconfigwidgets \
    ki18n \
    kiconthemes \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    attica \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "77fe1ec98f80c2399d76d7d759af8d2a"
SRC_URI[sha256sum] = "c5a821f9653b13d73d1d6564afe3740110ddaa96fb02cc9d65fcaff1cf27b1df"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-no-session-management-if-not-supported-by-qtbase-ind.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# evt. put ksendbugmail to separate package later
FILES_${PN}-dbg += "${libdir}/kxmlgui/kf5/.debug/"
