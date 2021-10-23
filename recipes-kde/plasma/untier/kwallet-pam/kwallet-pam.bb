SUMMARY = "Unlock KWallet using PAM"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=147a320ed8b16b036829a0c71d424153 \
"

REQUIRED_DISTRO_FEATURES = "pam"

inherit kde-plasma features_check

DEPENDS += " \
    libpam \
    libgcrypt \
    kwallet \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "63661188dae40e708e516de2611cf05e1d899a0f060995b27067107aa0645e0a"
SRC_URI += "file://0001-use-pkgconfig-to-find-libgcrypt.patch"

EXTRA_OECMAKE += "-DCMAKE_INSTALL_LIBDIR=${base_libdir}"

FILES:${PN} += " \
    ${base_libdir}/security \
    ${systemd_user_unitdir} \
"

RDEPENDS:${PN} = "socat"
