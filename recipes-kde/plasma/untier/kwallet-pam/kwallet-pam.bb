SUMMARY = "Unlock KWallet using PAM"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libpam \
    libgcrypt \
    kwallet \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "abbe4285cd507e191133453a015f5625"
SRC_URI[sha256sum] = "43bbe31e0c5f4092b3ba42b73deadb4e28d10fb1566320fa48ba377a1fa1c3db"
SRC_URI += " \
    file://0001-use-pkgconfig-to-find-libgcrypt.patch \
"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES_${PN} += "${base_libdir}/security"
