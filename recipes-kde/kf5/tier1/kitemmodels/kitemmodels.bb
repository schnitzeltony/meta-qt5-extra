SUMMARY = "Models for Qt Model/View system"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e1a8e1484398a40d2f9c14ece0bd657f"
SRC_URI[sha256sum] = "5b325c4ed82f63a221ff369e5d02d28368328db6b1e08c5b61d03eba959d3fe2"
