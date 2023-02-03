require linux-ti-staging_5.10.bb

# Look in the generic major.minor directory for files
# This will have priority over generic non-rt path
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-5.10:"

BRANCH = "ti-rt-linux-5.10.y"

SRCREV = "ef2648a6a6202f5dd78ccf2c45de48cf7653e19e"
PV = "5.10.162+git${SRCPV}"
