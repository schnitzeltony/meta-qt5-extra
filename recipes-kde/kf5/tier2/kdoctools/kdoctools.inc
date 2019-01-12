SUMMARY = "Documentation generation from docbook"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-kf5 perlnative

# allarch recipes
DEPENDS += "docbook-xml-dtd4 docbook-xsl-stylesheets liburi-perl-native"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a53d9abe7eb0d8e54d8dfb1ee9b1669f"
SRC_URI[sha256sum] = "a6c556eed5d7362ed20d75458386dec4de04feae3c583ed1133a71bf296e7575"

# allarch packages do only install into machine sysroot
# for xml4
OECMAKE_EXTRA_ROOT_PATH = "${STAGING_DIR}/${MACHINE}"
# for xsl (we have to hardcode /usr - ${prefix} is aligned by native.bbclase
EXTRA_OECMAKE += " \
    -DOE_ROOT_PATH_PREFIX=${STAGING_DIR}/${MACHINE}/usr \
    -DCMAKE_AR:FILEPATH=${AR} \
    -DINSTALL_INTERNAL_TOOLS=ON \
"

