SUMMARY = "User configurable main windows"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

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
SRC_URI[md5sum] = "70785bf8fb6e952e09963b37fc35e481"
SRC_URI[sha256sum] = "b57d2bcfc27f74556228dabcf914bb82e3bfea40ca1ce85ec222cd3f9da8b5b4"

# REVISIT remove ugly hack for wayland-only environments
SRC_URI += " \
    file://0001-no-session-management-if-not-supported-by-qtbase-ind.patch \
    file://0002-fix-path-to-ksendbugmail.patch \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlGui, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlGui, -S${includedir}, -S${STAGING_INCDIR}"

# evt. put ksendbugmail to separate package later
FILES_${PN}-dbg += "${libdir}/kxmlgui/kf5/.debug/"
